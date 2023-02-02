module ProviderTwo {
    requires Service;
    exports my.secondeServiceProvider;
    provides my.secondeServiceProvider.MyServiceImpl with my.secondeServiceProvider.MyServiceImpl;
}