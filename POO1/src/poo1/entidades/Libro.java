package poo1.entidades;
public class Libro {
    //atributos:
    public int isbn;
    public String titulo;
    public String autor;
    public int nropage;
    
    //metodos:
    public Libro() {
        
    }
    
    public Libro(int isbn, String titulo, String autor, int nropage) {
        //this.ISBN hace referencia al atributo ISBN de la clase, y ISBN hace
        //referencia al parametro ISBN que recibe el constructor.
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nropage = nropage;
    }
    
    public void mostrarLibro(){
        System.out.println("El numero ISBN del libro es: "+isbn);
        System.out.println("El titulo del libro es: "+titulo);
        System.out.println("El autor del libro es: "+autor);
        System.out.println("El numero de paginas del libro es: "+nropage);
    }
    
    //metodos set, sirven para modificar algun atributo del objeto, una vez que el objeto ya fue inicializado.
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNropage(int nropage) {
        this.nropage = nropage;
    }
    
    //metodos get, sirven para consultar algun atributo del objeto, una vez que el objeto ya fue inicializado.
    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNropage() {
        return nropage;
    }
    
    /*los metodos set y get en ese proyecto fueron creados solo para tener completo el proyecto, pero no fueron usados, ya que
    lo ideal para fueron usados los atributos deberian estar encasuplados, es decir, con el modificador de acceso private.*/
    
}