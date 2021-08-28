package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AddressType;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class AddressDataKey
 implements Identifier<AddressData> {
    private static final long serialVersionUID = 8153895744830229393L;
    private final Class<? extends AddressType> _type;


    public AddressDataKey(Class<? extends AddressType> _type) {
    
        this._type = _type;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AddressDataKey(AddressDataKey source) {
        this._type = source._type;
    }


    public Class<? extends AddressType> getType() {
        return _type;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_type);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressDataKey)) {
            return false;
        }
        final AddressDataKey other = (AddressDataKey) obj;
        if (!Objects.equals(_type, other._type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(AddressDataKey.class);
        CodeHelpers.appendValue(helper, "_type", _type);
        return helper.toString();
    }
}

