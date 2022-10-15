public class IllegalInputException extends CalculatorException {
    private String illegalType;

    public IllegalInputException(String s, String type){
        super(s);
        //Design this later, specified under Design section of document.
        this.illegalType = type;
    }

    public String getIllegalType(){
        return this.illegalType;
    }
}