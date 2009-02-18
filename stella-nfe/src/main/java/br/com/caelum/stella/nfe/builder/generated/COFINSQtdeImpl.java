package br.com.caelum.stella.nfe.builder.generated;

public final class COFINSQtdeImpl implements COFINSQtde, br.com.caelum.stella.nfe.ObjectCreator {
    private final br.com.caelum.stella.nfe.modelo.COFINSQtde cOFINSQtde;

    public COFINSQtdeImpl() {
        cOFINSQtde = new br.com.caelum.stella.nfe.modelo.COFINSQtde();
    }

    public br.com.caelum.stella.nfe.modelo.COFINSQtde getInstance() {
        return cOFINSQtde;
    }

    public COFINSQtde withCodigoSituacaoTributaria(final String string) {
        cOFINSQtde.setCodigoSituacaoTributaria(string);
        return this;
    }

    public COFINSQtde withQuantidadeVendida(final String string) {
        cOFINSQtde.setQuantidadeVendida(string);
        return this;
    }

    public COFINSQtde withAliquota(final String string) {
        cOFINSQtde.setAliquota(string);
        return this;
    }

    public COFINSQtde withValor(final String string) {
        cOFINSQtde.setValor(string);
        return this;
    }
}