package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.local.affinity.or.anti.affinity.rule;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.google.common.base.MoreObjects;

import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AffinityScope;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AffinityType;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class LocalAffinityOrAntiAffinityRuleKey extends KeyDeserializer
 implements Identifier<LocalAffinityOrAntiAffinityRule> {
    private static final long serialVersionUID = -2457432228320345751L;
    private final AffinityType _affinityType;
    private final AffinityScope _affinityScope;


    public LocalAffinityOrAntiAffinityRuleKey() {
        this._affinityType = null;
        this._affinityScope = null;
    }
    
    public LocalAffinityOrAntiAffinityRuleKey(AffinityScope _affinityScope, AffinityType _affinityType) {
    
        this._affinityType = _affinityType;
        this._affinityScope = _affinityScope;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LocalAffinityOrAntiAffinityRuleKey(LocalAffinityOrAntiAffinityRuleKey source) {
        this._affinityType = source._affinityType;
        this._affinityScope = source._affinityScope;
    }


    public AffinityType getAffinityType() {
        return _affinityType;
    }
    
    public AffinityScope getAffinityScope() {
        return _affinityScope;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_affinityType);
        result = prime * result + Objects.hashCode(_affinityScope);
        return result;
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalAffinityOrAntiAffinityRuleKey)) {
            return false;
        }
        final LocalAffinityOrAntiAffinityRuleKey other = (LocalAffinityOrAntiAffinityRuleKey) obj;
        if (!Objects.equals(_affinityType, other._affinityType)) {
            return false;
        }
        if (!Objects.equals(_affinityScope, other._affinityScope)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(LocalAffinityOrAntiAffinityRuleKey.class);
        CodeHelpers.appendValue(helper, "_affinityType", _affinityType);
        CodeHelpers.appendValue(helper, "_affinityScope", _affinityScope);
        return helper.toString();
    }

	@Override
	public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
		// TODO Auto-generated method stub
		return this.toString();
	}
}

