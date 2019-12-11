package m3.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import m3.model.filter.*;
import m3.model.offer.Offer;

public class Incentive {
    private String IncentiveID;
    private Date startDate;
    private Date endDate;
    private String title;
    private String disclaimer;

    private String dealerName;

    private Offer offer;

    private List<Filter> conditions;

    public Incentive() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Incentive incentive = (Incentive) o;
        return
                Objects.equals(startDate, incentive.startDate) &&
                Objects.equals(endDate, incentive.endDate) &&
                Objects.equals(title, incentive.title) &&
                Objects.equals(disclaimer, incentive.disclaimer) &&
                Objects.equals(dealerName, incentive.dealerName) &&
                Objects.equals(offer, incentive.offer) &&
                Objects.equals(conditions, incentive.conditions);
    }

    @Override
    public int hashCode() {

        return Objects.hash( startDate, endDate, title, disclaimer, dealerName, offer, conditions);
    }

    public Incentive(Date startDate, Date endDate, String title, String disclaimer, String dealerName, Offer offer, List<Filter> conditions) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.title = title;
        this.disclaimer = disclaimer;
        this.dealerName = dealerName;
        this.offer = offer;
        this.conditions = conditions;
    }

    public List<Filter> getConditions() {
        return conditions;
    }

    public void setIncentiveID(String ID){
        this.IncentiveID = ID;
    }

    public String getIncentiveID(){
        return IncentiveID;
    }

    public void setConditions(List<Filter> conditions) {
        this.conditions = conditions;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }
}
