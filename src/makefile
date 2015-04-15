
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
	
ARGSIN = \
	../entrada/pesquisadores.txt\
	../entrada/veiculos.txt\
	../entrada/artigos_veiculos.txt\
	../entrada/grafo_artigos_pesquisadores.txt\
	../entrada/grafo_citacoes.txt\
	
ARGSOUT = \
	../saida/popularidade_pesquisador.txt\
	../saida/fatorImpacto_veiculo.txt\
	../saida/pontuacao_artigo.txt\

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) */*.class	
	$(RM) *.class

run : classes
	$(JCR) MainClass $(ARGSIN) $(ARGSOUT)
