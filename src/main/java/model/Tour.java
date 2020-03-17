package model;


import java.util.Date;

public class Tour {
    protected String name;

    protected String operator;

    protected String agent;

    protected String guide;

    protected Date startDate;

    protected Date endDate;

    protected int basePrice;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public Tour(String agent, String operator, String name, String guide, Date startDate, Date endDate, int basePrice) {
        this.agent = agent;
        this.operator = operator;
        this.name = name;
        this.guide = guide;
        this.startDate = startDate;
        this.endDate = endDate;
        this.basePrice = basePrice;

    }


    @Override
    public String toString() {
        return "NAME : " + this.name + " OPERATOR: " + this.operator + " AGENT: " + this.agent + " GUIDE: " + this.guide +
                " STARTDATE: " + this.startDate + " ENDDATE:" + this.endDate + " " + "PRICE :" + this.basePrice + " ";

    }

    public static String getHeaders() {
        return "name," + "operator," + "agent," + "guide," + "startDate," + "endDate," + "baseprice,";
    }

    public String toSCV() {
        return name + "," + operator + "," + agent + "," + guide + "," + startDate + "," + endDate + "," + basePrice + ",";
    }


    //public void SumPrise () {


    // };
}