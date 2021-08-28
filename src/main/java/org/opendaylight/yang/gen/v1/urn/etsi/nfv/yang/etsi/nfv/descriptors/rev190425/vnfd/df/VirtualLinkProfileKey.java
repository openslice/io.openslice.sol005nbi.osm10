package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.google.common.base.MoreObjects;

import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VirtualLinkProfileKey extends KeyDeserializer
 implements Identifier<VirtualLinkProfile> {
    private static final long serialVersionUID = 1298066409440857060L;
    private final String _id;
    private final Object _flavour;


    public VirtualLinkProfileKey() {
    	// This might be also null, or not id/flavor not final.
        this._id = "";
        this._flavour = "";
    }
    
    public VirtualLinkProfileKey(Object _flavour, String _id) {
    
        this._id = _id;
        this._flavour = _flavour;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VirtualLinkProfileKey(VirtualLinkProfileKey source) {
        this._id = source._id;
        this._flavour = source._flavour;
    }


    public String getId() {
        return _id;
    }
    
    public Object getFlavour() {
        return _flavour;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_id);
        result = prime * result + Objects.hashCode(_flavour);
        return result;
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualLinkProfileKey)) {
            return false;
        }
        final VirtualLinkProfileKey other = (VirtualLinkProfileKey) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        if (!Objects.equals(_flavour, other._flavour)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VirtualLinkProfileKey.class);
        CodeHelpers.appendValue(helper, "_id", _id);
        CodeHelpers.appendValue(helper, "_flavour", _flavour);
        return helper.toString();
    }

	@Override
	public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
		// TODO Auto-generated method stub
		return this.toString();
	}
}

