public class SignedText
{
    private String first, last;

    public SignedText(String first, String last)
    {
        this.first = first;
        this.last = last;
    }

    public String getSignature()
    {
        if(first.length() > 0)
            return first.substring(0, 1) + "-" + last;
        else
            return last;
    }

    public String addSignature(String message)
    {
        String signature = getSignature();
        int index = message.indexOf(signature);

        if(index == 0)
            return message.substring(signature.length()) + signature;
        else if(index == -1)
            return message + signature;
        else
            return message;
    }
}
