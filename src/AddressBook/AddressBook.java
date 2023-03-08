package AddressBook;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;

public class AddressBook {
    LinkedList<String> nameBook = new LinkedList<>();
    LinkedList<String> phoneBook = new LinkedList<>();

    @NotNull
    public void addName(String name) {
        if(nameBook.contains(name)){
            System.out.println("이미 등록된 이름입니다.");
        } else {
            Contact contact = new Contact();
            contact.setName(name);
            nameBook.add(contact.name);
        }
    }
    @NotNull
    public void addPhone(String phone) {
        if(phoneBook.contains(phone)){
            System.out.println("이미 등록된 번호입니다.");
        } else {
            Contact contact = new Contact();
            contact.setPhone(phone);
            phoneBook.add(contact.phone);
        }
    }

    public String searchByName(String name){
        int value;
        String phone = null;
        if(nameBook.contains(name)){
            value = nameBook.indexOf(name);
            phone = phoneBook.get(value);
        } else {
            System.out.println("저장된 이름이 없습니다.");
        }
        return phone.toString();
    }

    public String searchByPhone(String phone){
        int value;
        String name = null;
        if(phoneBook.contains(phone)){
            value = phoneBook.indexOf(phone);
            name = nameBook.get(value);
        }else {
            System.out.println("저장된 번호가 없습니다.");
        }
        return name.toString();
    }
}
