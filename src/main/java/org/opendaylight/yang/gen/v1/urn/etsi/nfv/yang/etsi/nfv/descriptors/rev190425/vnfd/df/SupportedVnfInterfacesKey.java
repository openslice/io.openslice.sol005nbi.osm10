package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.google.common.base.MoreObjects;

import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class SupportedVnfInterfacesKey extends KeyDeserializer
 implements Identifier<SupportedVnfInterfaces> {
    private static final long serialVersionUID = -2854504684379865139L;
    private final SupportedVnfInterfaces.Name _name;


    public SupportedVnfInterfacesKey() {
        this._name = null;
    }
    
    public SupportedVnfInterfacesKey(SupportedVnfInterfaces.Name _name) {
    
        this._name = _name;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SupportedVnfInterfacesKey(SupportedVnfInterfacesKey source) {
        this._name = source._name;
    }


    public SupportedVnfInterfaces.Name getName() {
        return _name;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_name);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportedVnfInterfacesKey)) {
            return false;
        }
        final SupportedVnfInterfacesKey other = (SupportedVnfInterfacesKey) obj;
        if (!Objects.equals(_name, other._name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(SupportedVnfInterfacesKey.class);
        CodeHelpers.appendValue(helper, "_name", _name);
        return helper.toString();
    }

	@Override
	public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
		// TODO Auto-generated method stub
		return this.toString();
	}
}

