
JFLAGS = -g
JC = javac
JCR = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java -cp $(CLASSES)

CLASSES = \
	$(wildcard *.java)\
	$(wildcard redeSocialPesquisadores/*.java)\
	$(wildcard io/*.java)\

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) */*.class	
	$(RM) *.class

run : classes
	$(JCR) MainClass
