package june18;

public class ExcelDemo {
    private boolean read;
    private boolean write;

    public ExcelDemo(boolean read, boolean write) {
        this.read = read;
        this.write = write;
    }

    public boolean isWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public void displayPermission()
    {
        if(read && write)
        {
            System.out.println("Read and Write Permission");
        }
        else if(read && !write)
        {
            System.out.println("Read Only Permission");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
