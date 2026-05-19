public class StringBase {
    private String str = null;

    StringBase(String str){
        this.str = str;
    }

    public void reverseString(){
        StringBuilder sb = new StringBuilder(str);
        System.out.println("this is String Reverse through String Builder :"+sb.reverse());
        sb = null;
        sb = new StringBuilder("");
        for(int i=str.length()-1; i>=0;  i--){
            sb.append(str.charAt(i));
        }
        System.out.print("this is reverse through for loop .charAt and .append :"+sb.toString());
    }

    public void removeAllSpaces(){

        System.out.println("this is removing space through .replace method : "+ str.replace(" ",""));
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                sb.append(str.charAt(i));
            }
        }
        System.out.println("Removed Spaces from mannual method : "+sb.toString());
    }

    public void replaceCharFromString(char from, char to){
        System.out.println("Replacing through .replace() : "+str.replace(from,to));
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == from){
                sb.append(to);
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println("Replacing through mannula method : "+sb);
    }

    public void isStringEmpty(){
        System.out.println("Checking through isEmpty() : "+str.isEmpty());
        if(str.length() == 0){
            System.out.println("checking trough string lenght : true");
        }else{
            System.out.println("String is not empty");
        }
    }

    public void checkStringLength(){
        System.out.println("Checking through .length() : "+str.length());
        System.out.println("Checking lenght by .lastIndexOf() : "+str.lastIndexOf(""));
    }

    public void getIndexOfChar(char ch){
        System.out.println("First index is "+str.indexOf(ch));
        System.out.println("Last index is : "+str.lastIndexOf(ch));

    }

    public void getIndexOfSubString(String substring){
        System.out.println("First index of sub string "+substring+" is : "+ str.indexOf(substring));

        System.out.println("Last index of sub string "+substring+" is : "+ str.lastIndexOf(substring));

    }

    public void removeCharFromString(char ch){
        System.out.println("String after removing "+ch+" : "+str.replace(String.valueOf(ch),""));

    }

    public void replaceAllLowerCase(String replacement){
    System.out.println("Replacing all lowercase by "+replacement+" : "+str.replaceAll("[a-z]",replacement));
    }

    public void replaceAllLowerToUpperCase(){
        System.out.println("Converting to uppercase by toUpperCase() : "+str.toUpperCase());
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 97 && str.charAt(i)<= 122){
               sb.append((char)(str.charAt(i)-32));
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println("Converting to UpperCase by mannual method : "+sb.toString());
    }

    public void replaceALLUpperToLowerCase(){
        System.out.println("Converting to lowercase by toLowerCase() : "+str.toLowerCase());
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 129 && str.charAt(i)<= 154){
                sb.append((char)(str.charAt(i)+32));
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println("Converting to UpperCase by mannual method : "+sb.toString());


    }

    public void removeSpacesFromStart(){
        System.out.println("removing starting spaces with .replaceFirect() : "+str.replaceFirst("^\\s+", ""));
    }

    public void removeSpacesFromEnd(){
        System.out.println("Removing ending spaces by .replaceFirst() : "+str.replaceFirst("\\s+$",""));
    }

}
