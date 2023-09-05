package java_collections.Tasks_IM;


public class Books {
    private Integer id;
    private String name;
    private int pages;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }
    Books (int id,String name,int pages){
        this.id=id;
        this.name=name;
        this.pages=pages;
    }

    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ']';
    }
}
