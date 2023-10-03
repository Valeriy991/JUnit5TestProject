package com.valeriygulin.program;

import com.valeriygulin.service.Service;

public class Program {
    public static void main(String[] args) {
        Service service = new Service();
        int sum = service.sum(10, 15);
        System.out.println(sum);
    }
}
