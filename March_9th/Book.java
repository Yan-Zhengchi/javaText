public class Book {
    public String title;
    public int pageNum;
    public void detail(){
        System.out.println("教材名为："+getTitle()+"     "+"页数："+getPageNum());
    }

    public String getTitle() {
        return title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageNum(int pageNum) {
        if(pageNum<200){
            System.out.println(this.title+"Book页数不得少于200");
        }else{
            this.pageNum = pageNum;
        }

    }
}
