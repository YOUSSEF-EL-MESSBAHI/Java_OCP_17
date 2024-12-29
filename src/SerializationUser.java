import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

//To serialize the part of an object, the object can implement the java.io.Externalizable interface
//The writeExternal() method provides the logic for serialization i.e. writing the class fields into bytes. we are free to store only those fields which we want back after reading the serialized object back. Ignore the age field.
//The readExternal() method must deserialize the values in the same sequence and with the same types as were written by writeExternal().

//The readResolve() method is used during deserialization to ensure that the Singleton instance is preserved, preventing the creation of a new instance during the deserialization process.


class SerializationUser implements Externalizable {
    private Long id;
    private String name;
    private Integer age;

    public SerializationUser(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeLong(id);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        id = in.readLong();
    }
}

