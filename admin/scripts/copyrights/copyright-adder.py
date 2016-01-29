'''
Created on Jan 25, 2016

@author: sgemme
'''

from abc import ABCMeta, abstractmethod
import sys
import re

class CommentBlockAdder(object):
    
    def __init__(self, commentBlockFileName):
                    
        assert isinstance(commentBlockFileName, str)                
        
        # We load the comment block
        self.__loadCommentBlock(commentBlockFileName)
        
    def __loadCommentBlock(self, fileName):
        
        with open(fileName) as f:
            self.__commentBlock = f.readlines()
        
            f.close()
        
    def applyComment(self, fileName):
        
        assert isinstance(fileName,str)
        
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
        elif ( ext == "HTML" or 
               ext == "XML"):
            
            commentProvider = MarkupLanguageCommentProvider()
        elif ( ext == "MF" or ext == "SH" or ext == "PY"):
                        
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
        return "/**"
    
    def getEndCommentString(self):
        return " */"
    
    def getInCommentString(self):
        return " *"

if __name__ == '__main__':
    
    if len(sys.argv) != 3:
        sys.stderr.write("Synthax: " + sys.argv[0] + " fileName commentFileName\n")
        sys.exit(1)
    
    fileName = sys.argv[1]
    
    commentBlockFile = sys.argv[2]       
    
    commentAdder = CommentBlockAdder(commentBlockFile)
    
    commentAdder.applyComment(fileName)
    
    sys.exit(0)
    
    pass
