JAVAC=javac $(JAVAFLAGS)
JAVA=java $(JAVAFLAGS)
JAVACFLAGS= -d bin -sourcepath src -cp bin
JAVAFLAGS= -cp bin:resource
MAKE=make
MKDIR=mkdir -p
RM=rm -rf

compile:
	$(MKDIR) bin
	$(JAVAC) jp/shata/thesissystem/*.java

clean:
	$(RM) bin
