package ltd.miku.esl.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by piguanghua on 2016/11/24.
 */
@Document(indexName = "customer", type = "external", shards = 1, replicas = 0, refreshInterval = "-1")
public class Cliente {
    @Id
    private String id;

    private long account_number;

    private long balance;

    private String firstname;

    private String lastname;

    private int age;

    private String gender;

    private String address;

    private String employer;

    private String email;

    private String city;

    private String state;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public long getAccount_number()
    {
        return account_number;
    }

    public void setAccount_number(long account_number)
    {
        this.account_number = account_number;
    }

    public long getBalance()
    {
        return balance;
    }

    public void setBalance(long balance)
    {
        this.balance = balance;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getEmployer()
    {
        return employer;
    }

    public void setEmployer(String employer)
    {
        this.employer = employer;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    @Override
    public String toString()
    {
        return "Cliente{" + "id='" + id + '\'' + ", account_number=" + account_number + ", balance=" + balance + ", firstname='" + firstname + '\'' + ", lastname='" + lastname + '\'' + ", age=" + age + ", gender='" + gender + '\'' + ", address='" + address + '\'' + ", employer='" + employer + '\'' + ", email='" + email + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + '}';
    }
}
