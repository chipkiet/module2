package src.ObjectOrientedProgram.BookManage;

public class Magazine extends Document {
    protected int issueNumber;
    protected int monthIssue;

    public Magazine(String id, String nxb, int number, int issueNumber, int monthIssue){
        super(id, nxb, number);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber=" + issueNumber +
                ", monthIssue=" + monthIssue +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number=" + number +
                '}';
    }
}
