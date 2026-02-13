# 🛒 Hibernate Many-to-One Relationship  
## Customer & Order Example

This project demonstrates a **Many-to-One relationship** using Hibernate (JPA) between **Order** and **Customer** entities.

---

## 📌 Project Overview

- One **Customer** can place multiple **Orders**
- Each **Order** belongs to one **Customer**
- The foreign key is stored in the **Orders** table

---

## 🔹 Relationship Concept

Order (Many)  --------  (1) Customer

- Many Orders → One Customer  
- Foreign key stored in Orders table  

---

## 🛠 Technologies Used

- Java  
- Hibernate  
- JPA Annotations  
- MySQL  
- Maven  

---

## 🗄 Database Structure

### Customer Table
- id (Primary Key)  
- name  
- email  

### Orders Table
- id (Primary Key)  
- order_date  
- amount  
- customer_id (Foreign Key)  

---

## 🔁 Hibernate Mapping Concept

### Many-To-One (Owning Side)

- Defined in **Order entity**
- Uses `@ManyToOne`
- Uses `@JoinColumn(name = "customer_id")`
- This side owns the relationship

### One-To-Many (Optional Inverse Side)

- Can be defined in Customer entity
- Uses `@OneToMany(mappedBy = "customer")`
- Not mandatory for Many-to-One mapping

---

## 🔑 Key Annotations Used

- `@Entity` → Marks class as entity  
- `@Table` → Maps entity to table  
- `@Id` → Primary key  
- `@GeneratedValue` → Auto ID generation  
- `@ManyToOne` → Defines many-to-one relationship  
- `@JoinColumn` → Specifies foreign key column  

---

## ⚙ Fetch Strategies

- **FetchType.EAGER** → Customer loads immediately with Order  
- **FetchType.LAZY** → Customer loads only when accessed  

(Default for ManyToOne is EAGER)

---

## 🔁 Cascade Behavior (If Applied)

- CascadeType.PERSIST → Saving Order can also save Customer  
- CascadeType.MERGE → Updates propagate  
- CascadeType.REMOVE → Use carefully (may delete Customer)

---

## 🎯 Expected Behavior

- Multiple orders can reference the same customer  
- Customer information is shared across orders  
- Foreign key maintains relationship integrity  

---

## ✅ Conclusion

This project explains:

- Hibernate Many-to-One mapping  
- Owning side relationship  
- Foreign key handling  
- Fetch types (Lazy & Eager)  
- Cascade operations  

---

⭐ This example is useful for understanding real-world database relationships like Customer–Order systems.
