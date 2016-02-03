#!/usr/bin/env python3
'''
Created on Jan 25, 2016

@author: sgemme
'''

from abc import ABCMeta, abstractmethod
import sys
import re
import argparse

def extractExtension(fileName):
        
        ext = ''
        
        fields = fileName.split('.')
        
        if len(fields) > 0:
            ext = fields[-1]                  
        
        return ext
    
class File(object):        
    
    def __init__(self, fileName):
        self.__fileName = fileName
        self.__ext = None
        self.__copyright = None
        
        self.__copyrightRe = re.compile(".*copyright.*\d{4}",re.I)
        
        with open(self.__fileName) as f:
            self.__fileContent = f.readlines()
            
            f.close()
    
    def setCommentBlockFileName(self, commentBlockFileName):
        assert isinstance(commentBlockFileName, str)                
        
        # We load the comment block
        self.__loadCommentBlock(commentBlockFileName)
        
    def __loadCommentBlock(self, fileName):
        
        with open(fileName) as f:
            self.__commentBlock = f.readlines()
        
            f.close()
        
    def addHeader(self):                
        
        # Get the factory
        commentProvider = CommentFactory.getCharacterProvider(self.getExtension())                    
            
        headerInserted = False
            
        for line in self.__fileContent:                
            if not headerInserted and self._canInsertHeader(line):                    
                print(commentProvider.getBeginCommentString())
                for headerLine in self.__commentBlock:                        
                    sys.stdout.write(commentProvider.getInCommentString() + " " + headerLine) 
                headerInserted = True
                print(commentProvider.getEndCommentString())
                sys.stdout.write(line)
            else:                    
                sys.stdout.write(line)        
    
    @abstractmethod
    def _canInsertHeader(self, line):
        return True        
    
    def getExtension(self):
        if not self.__ext:
            self.__ext = extractExtension(self.__fileName)
        
        return self.__ext
    
    def stripHeader(self):                    
        
        # Ge the factory
        commentProvider = CommentFactory.getCharacterProvider(self.getExtension())        
        
        # It is expected that the first line is where the comment block starts
       
        inCopyrightBlock = False           
        done = False
        
        for line in self.__fileContent:      
            if (line.startswith(commentProvider.getBeginCommentString()) 
                and not done):
                inCopyrightBlock = True
            elif (line.startswith(commentProvider.getEndCommentString()) 
                  and not done):
                inCopyrightBlock = False
                done = True
            elif not inCopyrightBlock:
                sys.stdout.write(line)    
                
    def isCopyrighted(self):        
        
        copyrighted = False
        
        for line in self.__fileContent:            
            upperLine = line.upper()
            if self.__copyrightRe.match(upperLine):            
                copyrighted = "CANADIAN" not in upperLine                
                self.__copyright = line
                break
            
        return copyrighted
    
    def getCopyright(self):
        return self.__copyright
                
                    
class CFamilyFile(File):
    
    def _canInsertHeader(self, line):
        return True
    
class JavaFile(File):
        
    def _canInsertHeader(self, line):        
        return not line.startswith("package")
    
class XMLFile(File):
        
    def _canInsertHeader(self, line):
        return not line.startswith("<?")
    
class InterpreterFile(File):
        
    def _canInsertHeader(self, line):
        return not line.startswith("#!")
                    
class FileFactory(object):
    
    @classmethod
    def createFile(cls, fileName):
        assert isinstance(fileName, str)
        
        ext = extractExtension(fileName).upper()
        
        fileObject = None
        
        if (ext == "C" or 
            ext == "CPP" or  
            ext == "CXX" or
            ext == "H" or
            ext == "HPP" or 
            ext == "HXX"):          
            
            # Cpp file
            fileObject = CFamilyFile(fileName)
        elif (ext == "JAVA" or 
              ext == "XCORE"):
            
            fileObject = JavaFile(fileName)
            
        elif (ext == "HTML" or 
               ext == "XML"):
            
            fileObject = XMLFile(fileName)
        elif (ext == "SH" or ext == "PY"):                        
            fileObject = InterpreterFile(fileName)
            
        else:
            fileObject = InterpreterFile(fileName) 
            
        return fileObject                       

class CommentFactory(object):
    
    @classmethod
    def getCharacterProvider(cls, extension):                
        assert isinstance(extension, str)
        
        commentProvider = None
        
        ext = extension.upper()
                
        if (ext == "C" or 
            ext == "CPP" or  
            ext == "CXX" or
            ext == "H" or
            ext == "HPP" or 
            ext == "HXX" or
            ext == "JAVA" or 
            ext == "XCORE"):
            
            # Cpp file
            commentProvider = CCommentProvider()
        elif (ext == "HTML" or 
               ext == "XML"):
            
            commentProvider = MarkupLanguageCommentProvider()
        elif (ext == "SH" or ext == "PY"):
                        
            commentProvider = HashTagCommentProvider()
            
        else:
            commentProvider = HashTagCommentProvider()
            
        return commentProvider  

class CommentCharacterProvider(object):
    
    __metaclass__ = ABCMeta
    
    @abstractmethod
    def getBeginCommentString(self):
        pass
    
    @abstractmethod
    def getEndCommentString(self):
        pass
    
    @abstractmethod
    def getInCommentString(self):
        pass

class MarkupLanguageCommentProvider(CommentCharacterProvider):
    
    def getBeginCommentString(self):
        return "<!--"
    
    def getEndCommentString(self):
        return "-->"
    
    def getInCommentString(self):
        return ""
    
class HashTagCommentProvider(CommentCharacterProvider):
    
    def getBeginCommentString(self):
        return "#"
    
    def getEndCommentString(self):
        return self.getBeginCommentString()
    
    def getInCommentString(self):
        return self.getBeginCommentString()
    
class CCommentProvider(CommentCharacterProvider):
    
    def getBeginCommentString(self):
        return "/*"
    
    def getEndCommentString(self):
        return " */"
    
    def getInCommentString(self):
        return " *"

if __name__ == '__main__':
    
    parser = argparse.ArgumentParser()      
    
    subparsers = parser.add_subparsers(help="commands")  
                
    # Apply parser
    applyParser = subparsers.add_parser("apply", help="Apply comment block")
    applyParser.add_argument("sourceFile", help="Source File")
    applyParser.add_argument("copyrightBlock", help="Copyrith Block File")
    
    # Strip parser
    stripParser = subparsers.add_parser("strip", help="Strips Copyright Block from File")
    stripParser.add_argument("sourceFile", help="Source File to Strip Comments from")  
    
    args = parser.parse_args()    
   
    if not "sourceFile" in args:
        parser.print_usage()
        sys.exit(1)
        
    f = FileFactory.createFile(args.sourceFile)
    
    if not f.isCopyrighted():
    
        if "copyrightBlock" in args:    
            f.setCommentBlockFileName(args.copyrightBlock)
            f.addHeader()
        elif "sourceFile" in args:                
            f.stripHeader()
        else:
            parser.print_usage()
            sys.exit(1) 
    else:
        sys.stderr.write("Error, file " + args.sourceFile + " is copyrighted: " + str(f.getCopyright()) + "\n")
        sys.exit(1)
        
    sys.exit(0)
    
#     pass
