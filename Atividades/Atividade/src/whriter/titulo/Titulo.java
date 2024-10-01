package whriter.titulo;

public class Titulo {
    private String title;
    private String publisher;
    private int year;
    private int runtime;

    public Titulo(String title, String publisher, int year, int runtime) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.runtime = runtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", runtime=" + runtime +
                '}';
    }


    public static class TituloBuilder{
        private String title;
        private String publisher;
        private int year;
        private int runtime;

        public TituloBuilder title(String title) {
            this.title = title;
            return this;
        }

        public TituloBuilder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public TituloBuilder year(int year) {
            this.year = year;
            return this;
        }

        public TituloBuilder runtime(int runtime) {
            this.runtime = runtime;
            return this;
        }

        public Titulo Build(){
            return new Titulo(title,publisher,year,runtime);
        }
    }

}
