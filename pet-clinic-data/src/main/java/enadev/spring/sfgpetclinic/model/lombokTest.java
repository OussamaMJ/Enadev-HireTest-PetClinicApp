package enadev.spring.sfgpetclinic.model;

public class lombokTest {
    private Long aLong;
    private String string;

    public lombokTest() {
    }

    public Long getALong() {
        return this.aLong;
    }

    public String getString() {
        return this.string;
    }

    public void setALong(Long aLong) {
        this.aLong = aLong;
    }

    public void setString(String string) {
        this.string = string;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof lombokTest)) return false;
        final lombokTest other = (lombokTest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$aLong = this.getALong();
        final Object other$aLong = other.getALong();
        if (this$aLong == null ? other$aLong != null : !this$aLong.equals(other$aLong)) return false;
        final Object this$string = this.getString();
        final Object other$string = other.getString();
        if (this$string == null ? other$string != null : !this$string.equals(other$string)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof lombokTest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $aLong = this.getALong();
        result = result * PRIME + ($aLong == null ? 43 : $aLong.hashCode());
        final Object $string = this.getString();
        result = result * PRIME + ($string == null ? 43 : $string.hashCode());
        return result;
    }

    public String toString() {
        return "lombokTest(aLong=" + this.getALong() + ", string=" + this.getString() + ")";
    }
}
