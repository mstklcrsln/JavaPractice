package septemberStudiesAndHomeworks;

public class HttpProtocol {
    public static void main(String[] args) {

        int statusCode = 303;
        boolean trueNumber = statusCode==200 || statusCode==201 || statusCode==202 || statusCode==301 || statusCode==303 || statusCode== 304 || statusCode==307||
                                            statusCode==401 || statusCode==403 || statusCode== 404 || statusCode==410|| statusCode==500 || statusCode==503;

      String result=   (trueNumber)? (statusCode==200)? "OK" :(statusCode==201)? "Created"  :(statusCode==202)? "Accepted" :(statusCode==301)? "Move Permanently" :(statusCode==303)? "See Other" : (statusCode==304)?                          "Not Modified" :(statusCode==307)? "Temporary Redirect"  :(statusCode==400)? "Bad Request" :(statusCode==401)? "Unauthorized"  :(statusCode==403)? "Forbidden" :(statusCode==404)? "Not found"
                             :(statusCode==410)? "Gone"    :(statusCode==500)? "İnternal Server Error" : "Service Unavaible" : "You have applied wrong number";

        System.out.println("result = " + result);
    }
}
