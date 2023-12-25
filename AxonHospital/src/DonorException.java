public class DonorException extends Exception {
    private String msg;

    public DonorException(){
        msg = " Error with Application..... Please try again";
    }
    public DonorException(String msg)
    {
        this.msg=msg;
    }

    @Override
    public String getMessage()
    {
        return msg;
    }
    @Override
    public String toString()
    {
        return "Exception in Donor : "+msg;
    }
}
