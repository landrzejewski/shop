open module pl.training.payments.adapters {
    exports pl.training.payments.adapters.input.rest;
    exports pl.training.payments.adapters.output.id;
    exports pl.training.payments.adapters.output.persistence.jpa;
    exports pl.training.payments.adapters.output.persistence;
    exports pl.training.payments.adapters.output.time;
    exports pl.training.payments.adapters.commons.web;

    requires pl.training.payments.ports;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires spring.web;
    requires spring.webmvc;
    requires spring.jdbc;
    requires spring.boot.starter.web;
    requires spring.data.jpa;
    requires spring.data.commons;
    requires spring.boot.starter.data.jpa;
    requires spring.boot.autoconfigure;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires static lombok;
    requires static org.mapstruct;
    requires static org.mapstruct.processor;
    requires spring.tx;
}
