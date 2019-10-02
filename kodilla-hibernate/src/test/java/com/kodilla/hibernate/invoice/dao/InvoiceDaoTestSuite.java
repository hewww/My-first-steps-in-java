package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    ItemDao itemDao;

    @Autowired
    ProductDao productDao;

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        Product book = new Product("Książka");
        Product teddyBear = new Product("Pluszak");
        Product beer = new Product("Piwo");

        Item bookItem = new Item(book,new BigDecimal(24),2,new BigDecimal(2));
        Item teddyBearItem = new Item(teddyBear,new BigDecimal(39.99),15,new BigDecimal(4));
        Item beerItem = new Item(beer,new BigDecimal(2.99),39,new BigDecimal(20));

        Invoice invoice = new Invoice("997");
        invoice.getItems().add(bookItem);
        invoice.getItems().add(teddyBearItem);
        invoice.getItems().add(beerItem);

//        productDao.save(book);
//        productDao.save(teddyBear);
//        productDao.save(beer);
//
//        itemDao.save(bookItem);
//        itemDao.save(teddyBearItem);
//        itemDao.save(beerItem);

        invoiceDao.save(invoice);
        int invoiceID = invoice.getId();



        //CleanUp
//        try {
//            invoiceDao.deleteById(invoiceID);
//        } catch (Exception e) {
//            System.out.println("Błąd");
//        }

    }


}
