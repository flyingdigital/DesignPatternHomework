package com.flyingdigital.ConcreteTVFactory;

import com.flyingdigital.ConcreteTV.Haier;
import com.flyingdigital.ConcreteTV.Hisense;
import com.flyingdigital.TV.AbstractTV;
import com.flyingdigital.TVFactory.AbstractTVFactory;

public class HisenseFactory extends AbstractTVFactory {
    @Override
    public AbstractTV productTV() {
        return new Hisense();
    }
}
