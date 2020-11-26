package com.Aplikasi.Penilangan.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "tilang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tilang.findAll", query = "SELECT t FROM Tilang t")
    , @NamedQuery(name = "Tilang.findByTilangId", query = "SELECT t FROM Tilang t WHERE t.tilangId = :tilangId")
    , @NamedQuery(name = "Tilang.findByTilangName", query = "SELECT t FROM Tilang t WHERE t.tilangName = :tilangName")
    , @NamedQuery(name = "Tilang.findByTilangPlat", query = "SELECT t FROM Tilang t WHERE t.tilangPlat = :tilangPlat")
    , @NamedQuery(name = "Tilang.findByTilangPelanggaran", query = "SELECT t FROM Tilang t WHERE t.tilangPelanggaran = :tilangPelanggaran")
    , @NamedQuery(name = "Tilang.findByTilangKendaraan", query = "SELECT t FROM Tilang t WHERE t.tilangKendaraan = :tilangKendaraan")})
public class Tilang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tilang_id")
    private Integer tilangId;
    //
    @Basic(optional = false)
    @Column(name = "pelaku_name")
    private String tilangName;
    //
    @Basic(optional = false)
    @Column(name = "Plat")
    private String tilangPlat;
    //
    @Basic(optional = false)
    @Column(name = "Tipe_Pelanggaran")
    private String tilangPelanggaran;
    //
    @Basic(optional = false)
    @Column(name = "Kendaraan")
    private String tilangKendaraan;
    

    public Tilang() {
    }

    public Tilang(Integer tilangId) {
        this.tilangId = tilangId;
    }

    public Tilang(Integer tilangId, String tilangName) {
        this.tilangId = tilangId;
        this.tilangName = tilangName;
    }

    public Integer getTilangId() {
        return tilangId;
    }

    public void setTilangId(Integer tilangId) {
        this.tilangId = tilangId;
    }

    public String getTilangName() {
        return tilangName;
    }

    public void setTilangName(String tilangName) {
        this.tilangName = tilangName;
    }

    public String getTilangPlat() {
        return tilangPlat;
    }

    public void setTilangPlat(String tilangPlat) {
        this.tilangPlat = tilangPlat;
    }

    public String getTilangPelanggaran() {
        return tilangPelanggaran;
    }

    public void setTilangPelanggaran(String tilangPelanggaran) {
        this.tilangPelanggaran = tilangPelanggaran;
    }

    public String getTilangKendaraan() {
        return tilangKendaraan;
    }

    public void setTilangKendaraan(String tilangKendaraan) {
        this.tilangKendaraan = tilangKendaraan;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tilangId != null ? tilangId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tilang)) {
            return false;
        }
        Tilang other = (Tilang) object;
        if ((this.tilangId == null && other.tilangId != null) || (this.tilangId != null && !this.tilangId.equals(other.tilangId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pl.Pemrograman.Lanjut.entities.Tilang[ tilangId=" + tilangId + " ]";
    }
    
}