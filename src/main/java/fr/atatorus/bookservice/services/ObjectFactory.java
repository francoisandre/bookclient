
package fr.atatorus.bookservice.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.atatorus.bookservice.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAuthorsFromBookResponse_QNAME = new QName("http://services.bookservice.atatorus.fr/", "getAuthorsFromBookResponse");
    private final static QName _GetBook_QNAME = new QName("http://services.bookservice.atatorus.fr/", "getBook");
    private final static QName _GetBooksByTitle_QNAME = new QName("http://services.bookservice.atatorus.fr/", "getBooksByTitle");
    private final static QName _CreateBook_QNAME = new QName("http://services.bookservice.atatorus.fr/", "createBook");
    private final static QName _GetBookResponse_QNAME = new QName("http://services.bookservice.atatorus.fr/", "getBookResponse");
    private final static QName _GetBooksByTitleResponse_QNAME = new QName("http://services.bookservice.atatorus.fr/", "getBooksByTitleResponse");
    private final static QName _BookNotFoundException_QNAME = new QName("http://services.bookservice.atatorus.fr/", "BookNotFoundException");
    private final static QName _GetAuthorsFromBook_QNAME = new QName("http://services.bookservice.atatorus.fr/", "getAuthorsFromBook");
    private final static QName _CreateBookResponse_QNAME = new QName("http://services.bookservice.atatorus.fr/", "createBookResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.atatorus.bookservice.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateBook }
     * 
     */
    public CreateBook createCreateBook() {
        return new CreateBook();
    }

    /**
     * Create an instance of {@link Book_Type }
     * 
     */
    public Book_Type createBook_Type() {
        return new Book_Type();
    }

    /**
     * Create an instance of {@link BookNotFoundException }
     * 
     */
    public BookNotFoundException createBookNotFoundException() {
        return new BookNotFoundException();
    }

    /**
     * Create an instance of {@link GetBooksByTitleResponse }
     * 
     */
    public GetBooksByTitleResponse createGetBooksByTitleResponse() {
        return new GetBooksByTitleResponse();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link GetAuthorsFromBook }
     * 
     */
    public GetAuthorsFromBook createGetAuthorsFromBook() {
        return new GetAuthorsFromBook();
    }

    /**
     * Create an instance of {@link GetBook }
     * 
     */
    public GetBook createGetBook() {
        return new GetBook();
    }

    /**
     * Create an instance of {@link GetBooksByTitle }
     * 
     */
    public GetBooksByTitle createGetBooksByTitle() {
        return new GetBooksByTitle();
    }

    /**
     * Create an instance of {@link GetBookResponse }
     * 
     */
    public GetBookResponse createGetBookResponse() {
        return new GetBookResponse();
    }

    /**
     * Create an instance of {@link GetAuthorsFromBookResponse }
     * 
     */
    public GetAuthorsFromBookResponse createGetAuthorsFromBookResponse() {
        return new GetAuthorsFromBookResponse();
    }

    /**
     * Create an instance of {@link CreateBookResponse }
     * 
     */
    public CreateBookResponse createCreateBookResponse() {
        return new CreateBookResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthorsFromBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "getAuthorsFromBookResponse")
    public JAXBElement<GetAuthorsFromBookResponse> createGetAuthorsFromBookResponse(GetAuthorsFromBookResponse value) {
        return new JAXBElement<GetAuthorsFromBookResponse>(_GetAuthorsFromBookResponse_QNAME, GetAuthorsFromBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "getBook")
    public JAXBElement<GetBook> createGetBook(GetBook value) {
        return new JAXBElement<GetBook>(_GetBook_QNAME, GetBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "getBooksByTitle")
    public JAXBElement<GetBooksByTitle> createGetBooksByTitle(GetBooksByTitle value) {
        return new JAXBElement<GetBooksByTitle>(_GetBooksByTitle_QNAME, GetBooksByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "createBook")
    public JAXBElement<CreateBook> createCreateBook(CreateBook value) {
        return new JAXBElement<CreateBook>(_CreateBook_QNAME, CreateBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "getBookResponse")
    public JAXBElement<GetBookResponse> createGetBookResponse(GetBookResponse value) {
        return new JAXBElement<GetBookResponse>(_GetBookResponse_QNAME, GetBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "getBooksByTitleResponse")
    public JAXBElement<GetBooksByTitleResponse> createGetBooksByTitleResponse(GetBooksByTitleResponse value) {
        return new JAXBElement<GetBooksByTitleResponse>(_GetBooksByTitleResponse_QNAME, GetBooksByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "BookNotFoundException")
    public JAXBElement<BookNotFoundException> createBookNotFoundException(BookNotFoundException value) {
        return new JAXBElement<BookNotFoundException>(_BookNotFoundException_QNAME, BookNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthorsFromBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "getAuthorsFromBook")
    public JAXBElement<GetAuthorsFromBook> createGetAuthorsFromBook(GetAuthorsFromBook value) {
        return new JAXBElement<GetAuthorsFromBook>(_GetAuthorsFromBook_QNAME, GetAuthorsFromBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "createBookResponse")
    public JAXBElement<CreateBookResponse> createCreateBookResponse(CreateBookResponse value) {
        return new JAXBElement<CreateBookResponse>(_CreateBookResponse_QNAME, CreateBookResponse.class, null, value);
    }

}
