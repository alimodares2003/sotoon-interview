package com.sotoon;

public class Testing {
    public void runable() {
        Model model = new Model();
        model.hashCode();
        System.out.println(model.count);
        model.change(50);
        System.out.println(model.count);
//        System.out.println(model.isActive());
//        changer(model);
//        System.out.println(model.isActive());
    }

    private void changer(Model model) {
//        model = model.reset();
//        Model model2 = model;
//        model2.isActive()
        model.revoke(false);
    }

}
