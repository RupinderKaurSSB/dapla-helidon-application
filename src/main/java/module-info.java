module no.ssb.helidon.application {
    requires java.logging;
    requires jul.to.slf4j;
    requires org.slf4j;
    requires logback.classic;
    requires io.helidon.webserver;
    requires io.opentracing.api;
    requires com.google.protobuf;

    exports no.ssb.helidon.application;
}