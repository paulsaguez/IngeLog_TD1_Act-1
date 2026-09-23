package org.example;

import java.util.Objects;

/** Classe Produit représentant un produit avec un prix et une référence. */
public class Produit {
    /**
     * String faisant référence à la référence du produit.
     */
    private final String reference;
    /**
     * Double faisant référence au prix du produit.
     */
    private double prix;
    /**
     * Constante de TVA à 20%.
     */
    static final double TVA = 0.20;

    /**
     * Constructeur de l'objet Produit.
     * @param newReference : reference à initialiser à la contruction de l'objet
     */
    public Produit(final String newReference) {
        this.reference = newReference;
    }

    /** @return le prix. */
    public double getPrix() {
        return this.prix;
    }

    /** modifie le prix.
     * @param montant : montant à appliquer au produit
     */
    public final void setPrix(final Double montant) {
        this.prix = montant;
    }

    /**
     * @return la reference si le prix est positif, null sinon.
     */
    public final String getReference() {
        String resultat = reference;
        if (prix > 0) {
            return reference;
        }
        return null;
    }

    /**
     * Permet de vérifier la similitude d'un objet à un autre.
     */
    @Override
    public boolean equals(final Object o) {
        return Objects.equals(reference, ((Produit) o).reference);
    }

    /**
     * Permet la localisation en mémoire de l'objet.
     */
    @Override
    public int hashCode() {
        return Objects.hash(reference, prix);
    }
}
