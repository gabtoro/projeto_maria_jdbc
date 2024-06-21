package com.eleodoro.modelo;

public class Vencidemento {
    
    private date dataVencimento;

    public Vencidemento() {
    }

    public Vencidemento(date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dataVencimento == null) ? 0 : dataVencimento.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vencidemento other = (Vencidemento) obj;
        if (dataVencimento == null) {
            if (other.dataVencimento != null)
                return false;
        } else if (!dataVencimento.equals(other.dataVencimento))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Vencidemento [dataVencimento=" + dataVencimento + "]";
    }

    

}
