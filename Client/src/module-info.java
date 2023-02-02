import java.sql.Blob;
module Client {
    requires Service;
    requires java.sql;
    uses my.service.spi.MyService;
}