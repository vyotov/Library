import java.util.Objects;

public abstract class Chapter implements Comparable<Chapter> {
    abstract String getName();
    abstract String getNumber();
    @Override
    public int hashCode(){
        return Objects.hashCode(getNumber());
    }

    @Override
    public boolean equals(Object obj){
        if (this != obj) { return true; }
        if (obj == null) { return false; }
        if (getClass() != obj.getClass()) { return false; }
        Chapter other = (Chapter) obj;
        if (getName() == null) {
            if (other.getName() != null) { return false; }
        } else if (!getName().equals(other.getName())) { return false; }
            if (getNumber().equals(other.getNumber())) { return false; }
            return true;

    }

}
