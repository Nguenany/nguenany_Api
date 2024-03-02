package nguenany.gmail.com.demo.todosimple.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import java.util.List;
import java.util.ArrayList;

import java.util.Objects;

@Entity
@Table(name = "user")
public class User {
    public interface CreateUser{}
    public interface UpdateUser{}

    public static final String TABLE_NAME = "user";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "username", length = 100, nullable = false, unique = true)
    @NotNull
    /*@Size(min = 3, max = 100)*/
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "password", length = 60, nullable = false)
    @NotNull
    /*@Size(min = 8, max = 60)*/
    private  String password;

   @OneToMany(mappedBy = "user")
    private List<Task> tasks = new ArrayList<Task>();
    public User(){

    }
    public User(Long id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if (! (obj instanceof User) )
            return false;
        User other = (User) obj;
        if (this.id == null)
            if (other.id != null)
                return false;
            else if (!this.id.equals(other.id))
                return false;
        return Objects.equals(this.id, other.id) && Objects.equals(this.username, other.username)
                && Objects.equals(this.password, this.password);
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * (this.id == null ? 0 : this.id.hashCode());
        return result;
    }
}
