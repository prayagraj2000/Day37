private static void updateContact() {
                System.out.println("Enter existing contact name : ");
                String name = scanner.nextLine();
                Contacts extContact = mobilePhone.queryContact(name);
                if(extContact == null)
                {
                        System.out.println("Cannot found contact");
                        return;

                }
                System.out.println("Enter new Conatct Name: ");
                String newName = scanner.nextLine();
                System.out.println("Enter new Phone Number: ");
                String newNumber = scanner.nextLine();
                Contacts newContact = Contacts.createContact(newName, newNumber);
                if(mobilePhone.updateContact(extContact, newContact);
                {
                        System.out.println("Successfully updated");
                }else {
                        System.out.println("Error");
                }
        }