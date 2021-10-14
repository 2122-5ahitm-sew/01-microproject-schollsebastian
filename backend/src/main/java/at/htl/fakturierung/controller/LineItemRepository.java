package at.htl.fakturierung.controller;

import at.htl.fakturierung.entity.LineItem;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LineItemRepository implements PanacheRepository<LineItem> {
}
