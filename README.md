# Ana Gjurchinova, 222004
# Control Flow Graph 

![mydiagram](https://github.com/anagjurchinova/SI_2024_lab2_222004/assets/120587988/e1f8ea87-9ea8-406d-b51c-9e412ae1fe7e)

# Цикломатска комплексност

Цикломатската комплексност на кодот е 10, пресметана според формулата P+1, каде P го означува бројот на предикатни јазли. Во овој случај, бројот на предикатни јазли е 9, што значи дека цикломатската комплексност е 10.

#Тест случаи според Every branch критериумот

Item("Bluza","A",400,10.0),Payment=200
Item("Pernica","1212",470,20.0),Payment=290
Item("Shnola","989",50,0.0),Payment=55
Item(null,"001",500,20.0),Payment=150
Item("Kniga",null,120,5.0),60

![tabela](https://github.com/anagjurchinova/SI_2024_lab2_222004/assets/120587988/cf53a5c8-b587-4570-8724-5671434547c5)

#Tест случаи според критериумот Multiple Condition

if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')

Можни услови :

F && X && X -> item.getPrice() < =300 , item.getDiscount() = anything, item.getBarcode().charAt(0)=anything

T && F && X ->item.getPrice() >=300 , item.getDiscount() <=0 , item.getBarcode().chatAt(0)=anything

T && T && T -> item.getPrice() >= 300, item.getDiscount() > 0 , item.getBarcode().charAt(0) == '0'
