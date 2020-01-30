package com.greenfox.week7day4.dependencies;

import com.greenfox.week7day4.dependencies.color.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.plaf.basic.BasicDesktopIconUI;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {
    MyColor myColor;

    @Autowired
    public DependenciesApplication(MyColor myColor) {
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(DependenciesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myColor.coloring();
    }
}
