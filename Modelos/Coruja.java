package Modelos;

public class Coruja extends Animal {




    public Coruja(String habitat, String nome, String especie, String genero, int idade ) {
        super(habitat, nome, especie, genero, idade );


    }


    @Override
    public String getHabitat() {return habitat;}

    @Override
    public void setHabitat(String habitat) {this.habitat = habitat;}
    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getEspecie() {
        return super.getEspecie();
    }

    @Override
    public void setEspecie(String especie) {
        super.setEspecie(especie);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public String getGenero() {
        return genero;
    }

    @Override
    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }




    @Override
    public String toString(){
        return "\nHabitat: " + this.habitat + "\nNome: "+ this.nome + " \nEspecie: "+  this.especie + " \nGenero: "+ this.genero+ " \nIdade: " + this.idade ;
    }
    }