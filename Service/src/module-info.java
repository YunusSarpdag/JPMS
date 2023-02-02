module Service {
    exports my.service.spi to Client, ProviderTwo;
    opens my.service.impl;
}