
package fr.atatorus.bookservice.services;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2018-03-23T14:53:35.132+01:00
 * Generated source version: 2.7.3
 * 
 */
public final class Book_BookPort_Client {

    private static final QName SERVICE_NAME = new QName("http://services.bookservice.atatorus.fr/", "BookService");

    private Book_BookPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = BookService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        BookService ss = new BookService(wsdlURL, SERVICE_NAME);
        Book port = ss.getBookPort();  
        
        {
        System.out.println("Invoking getBook...");
        java.lang.Long _getBook_bookId = null;
        try {
            fr.atatorus.bookservice.services.Book_Type _getBook__return = port.getBook(_getBook_bookId);
            System.out.println("getBook.result=" + _getBook__return);

        } catch (BookNotFoundException_Exception e) { 
            System.out.println("Expected exception: BookNotFoundException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getBooksByTitle...");
        java.lang.String _getBooksByTitle_title = "";
        java.util.List<fr.atatorus.bookservice.services.Book_Type> _getBooksByTitle__return = port.getBooksByTitle(_getBooksByTitle_title);
        System.out.println("getBooksByTitle.result=" + _getBooksByTitle__return);


        }
        {
        System.out.println("Invoking createBook...");
        java.lang.String _createBook_title = "";
        fr.atatorus.bookservice.services.BookType _createBook_type = null;
        int _createBook_year = 0;
        java.util.List<java.lang.Long> _createBook_authorsId = null;
        java.lang.Long _createBook__return = port.createBook(_createBook_title, _createBook_type, _createBook_year, _createBook_authorsId);
        System.out.println("createBook.result=" + _createBook__return);


        }
        {
        System.out.println("Invoking getAuthorsFromBook...");
        java.lang.String _getAuthorsFromBook_bookTitle = "";
        try {
            java.util.List<fr.atatorus.bookservice.services.Author> _getAuthorsFromBook__return = port.getAuthorsFromBook(_getAuthorsFromBook_bookTitle);
            System.out.println("getAuthorsFromBook.result=" + _getAuthorsFromBook__return);

        } catch (BookNotFoundException_Exception e) { 
            System.out.println("Expected exception: BookNotFoundException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
