#!/usr/bin/env python3
'''
Created on Jan 25, 2016

@author: sgemme
'''

from abc import ABCMeta, abstractmethod
import sys
import re
import argparse

           
class Copyright(object):
    
    def __init__(self, commentBlockFileName=None):
                    
        if commentBlockFileName:
            assert isinstance(commentBlockFileName, str)                
        
            # We load the comment block
            self.__loadCommentBlock(commentBlockFileName)

    def setCommentBlockFileName(self, commentBlockFileName):
        assert isinstance(commentBlockFileName, str)                
        
        # We load the comment block
        self.__loadCommentBlock(commentBlockFileName)
        
    def __loadCommentBlock(self, fileName):
        
        with open(fileName) as f:
            self.__commentBlock = f.readlines()
        
            f.close()
        
    def apply(self, fileName):
        
        assert isinstance(fileName, str)
        
        # Extract extension from file name.
        ext = self.__extractExtension(fileName)
        
        # Ge the factory
        commentProvider = CommentFactory.getCharacterProvider(ext)
        
        # Write copyright header
        print(commentProvider.getBeginCommentString())
        for line in self.__commentBlock:                
            sys.stdout.write(commentProvider.getInCommentString() + " " + line)
            
        print(commentProvider.getEndCommentString())
        
        with open(fileName) as f:
            for line in f:
                sys.stdout.write(line)
                
            f.close()
            
    def strip(self, fileName):
        
        assert isinstance(fileName, str)                
                
        # Extract extension from file name.
        ext = self.__extractExtension(fileName)
        
        # Ge the factory
        commentProvider = CommentFactory.getCharacterProvider(ext)        
        
        # It is expected that the first line is where the comment block starts
        with open(fileName) as f:
            inCopyrightBlock = False
            lineNumber = 0

            done = False
            
            for line in f:
                if (lineNumber == 0 and 
                    line.startswith(commentProvider.getBeginCommentString()) and not done):
                    inCopyrightBlock = True
                elif line.startswith(commentProvider.getEndCommentString()) and not done:
                    inCopyrightBlock = False
                    done = True
                elif not inCopyrightBlock:
                    sys.stdout.write(line)
        
    def __extractExtension(self, fileName):
        
        ext = ''
        
        fields = fileName.split('.')
        
        if len(fields) > 0:
            ext = fields[-1]                  
        
        return ext
        

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
            ext == "JAVA"):
            
            # Cpp file
            commentProvider = CCommentProvider()
        elif (ext == "HTML" or 
               ext == "XML"):
            
            commentProvider = MarkupLanguageCommentProvider()
        elif (ext == "MF" or ext == "SH" or ext == "PY"):
                        
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
        return "<!-- "
    
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
    stripParser = subparsers.add_parser("strip", help="Strips Copyrith Block from File")
    stripParser.add_argument("sourceFile", help="Source File to Strip Comments from")  
    
    args = parser.parse_args()    
   
    if "copyrightBlock" in args:
        commentAdder = Copyright(args.copyrightBlock)         
        commentAdder.apply(args.sourceFile)
    elif "sourceFile" in args:        
        commentAdder = Copyright()
        commentAdder.strip(args.sourceFile)
    else:
        parser.print_usage()
        sys.exit(1) 
    
    sys.exit(0)
    
#     pass