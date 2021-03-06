package com.highpowerbear.hpbanalytics.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by robertk on 5/29/2017.
 */
@Entity
@Table(name = "ib_account", schema = "hpbanalytics", catalog = "hpbanalytics")
public class IbAccount implements Serializable {
    private static final long serialVersionUID = -5309297107924803768L;

    @Id
    private String accountId;
    private String host;
    private Integer port;
    private Integer clientId;
    private boolean listen;
    private boolean allowUpd;
    private boolean stk;
    private boolean fut;
    private boolean opt;
    private boolean fx;
    private boolean cfd;
    @Transient
    private Boolean connected;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IbAccount ibAccount = (IbAccount) o;

        return Objects.equals(accountId, ibAccount.accountId);
    }

    @Override
    public int hashCode() {
        return accountId != null ? accountId.hashCode() : 0;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public boolean isListen() {
        return listen;
    }

    public void setListen(boolean listen) {
        this.listen = listen;
    }

    public boolean isAllowUpd() {
        return allowUpd;
    }

    public void setAllowUpd(boolean allowUpd) {
        this.allowUpd = allowUpd;
    }

    public boolean isStk() {
        return stk;
    }

    public void setStk(boolean stk) {
        this.stk = stk;
    }

    public boolean isFut() {
        return fut;
    }

    public void setFut(boolean fut) {
        this.fut = fut;
    }

    public boolean isOpt() {
        return opt;
    }

    public void setOpt(boolean opt) {
        this.opt = opt;
    }

    public boolean isFx() {
        return fx;
    }

    public void setFx(boolean fx) {
        this.fx = fx;
    }

    public boolean isCfd() {
        return cfd;
    }

    public void setCfd(boolean cfd) {
        this.cfd = cfd;
    }

    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }
}
