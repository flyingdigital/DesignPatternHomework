package com.flyingdigital.ConcreteTVFactory;

import com.flyingdigital.ConcreteTV.Haier;
import com.flyingdigital.TV.AbstractTV;
import com.flyingdigital.TVFactory.AbstractTVFactory;

public class HaierFactory extends AbstractTVFactory {
    @Override
    public AbstractTV productTV() {
        return new Haier();
    }
}
