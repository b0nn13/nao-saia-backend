package br.com.nao.saia.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

/**
 * Entidade que representa Empresa
 *
 * @author Taynan Rezende
 * @since 22/03/2020
 */
@Document(collection = "merchants")
public class Merchant extends EntitySupport {

    private String fantasyName;
    
    private String companyName;
    
    private String cnpj;
    
    private Address address;
    
    private boolean acceptTerms;
    
    private boolean active;
    
    private String logo;
    
    private List<String> categories;
    
    private List<String> ads;
    
    private String whatsapp;
    
    private List<String> phones;
    
    private boolean ifood;
    
    private boolean uberEats;
    
    private boolean rappi;
    
    private boolean ownDelivery;
    
    private boolean displayAddress;
    
    private String note;
    
    public String getFantasyName() {
        return fantasyName;
    }
    
    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }
    
    public String getCompanyName() {
        return companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public boolean isAcceptTerms() {
        return acceptTerms;
    }
    
    public void setAcceptTerms(boolean acceptTerms) {
        this.acceptTerms = acceptTerms;
    }
    
    public boolean isActive() {
        return active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    
    public String getLogo() {
        return logo;
    }
    
    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    public List<String> getCategories() {
        return categories;
    }
    
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }
    
    public List<String> getAds() {
        return ads;
    }
    
    public void setAds(List<String> ads) {
        this.ads = ads;
    }
    
    public String getWhatsapp() {
        return whatsapp;
    }
    
    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
    
    public List<String> getPhones() {
        return phones;
    }
    
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
    
    public boolean isIfood() {
        return ifood;
    }
    
    public void setIfood(boolean ifood) {
        this.ifood = ifood;
    }
    
    public boolean isUberEats() {
        return uberEats;
    }
    
    public void setUberEats(boolean uberEats) {
        this.uberEats = uberEats;
    }
    
    public boolean isRappi() {
        return rappi;
    }
    
    public void setRappi(boolean rappi) {
        this.rappi = rappi;
    }
    
    public boolean isOwnDelivery() {
        return ownDelivery;
    }
    
    public void setOwnDelivery(boolean ownDelivery) {
        this.ownDelivery = ownDelivery;
    }
    
    public boolean isDisplayAddress() {
        return displayAddress;
    }
    
    public String getNote() {
        return note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    
    public void setDisplayAddress(boolean displayAddress) {
        this.displayAddress = displayAddress;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Merchant merchant = (Merchant) o;
        return acceptTerms == merchant.acceptTerms && active == merchant.active && ifood == merchant.ifood &&
                uberEats == merchant.uberEats && rappi == merchant.rappi && ownDelivery == merchant.ownDelivery &&
                displayAddress == merchant.displayAddress && Objects.equals(fantasyName, merchant.fantasyName) &&
                Objects.equals(companyName, merchant.companyName) && Objects.equals(cnpj, merchant.cnpj) &&
                Objects.equals(address, merchant.address) && Objects.equals(logo, merchant.logo) &&
                Objects.equals(categories, merchant.categories) && Objects.equals(ads, merchant.ads) &&
                Objects.equals(whatsapp, merchant.whatsapp) && Objects.equals(phones, merchant.phones) &&
                Objects.equals(note, merchant.note);
    }
    
    @Override
    public int hashCode() {
        return Objects
                .hash(fantasyName, companyName, cnpj, address, acceptTerms, active, logo, categories, ads, whatsapp,
                        phones, ifood, uberEats, rappi, ownDelivery, displayAddress, note);
    }
}
