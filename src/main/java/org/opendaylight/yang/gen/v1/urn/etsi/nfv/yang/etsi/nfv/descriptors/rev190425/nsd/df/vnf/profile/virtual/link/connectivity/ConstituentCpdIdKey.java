package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.vnf.profile.virtual.link.connectivity;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ConstituentCpdIdKey
 implements Identifier<ConstituentCpdId> {
    private static final long serialVersionUID = -6015428103661446636L;
    private final String _constituentBaseElementId;


    public ConstituentCpdIdKey(String _constituentBaseElementId) {
    
        this._constituentBaseElementId = _constituentBaseElementId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ConstituentCpdIdKey(ConstituentCpdIdKey source) {
        this._constituentBaseElementId = source._constituentBaseElementId;
    }


    public String getConstituentBaseElementId() {
        return _constituentBaseElementId;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_constituentBaseElementId);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConstituentCpdIdKey)) {
            return false;
        }
        final ConstituentCpdIdKey other = (ConstituentCpdIdKey) obj;
        if (!Objects.equals(_constituentBaseElementId, other._constituentBaseElementId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ConstituentCpdIdKey.class);
        CodeHelpers.appendValue(helper, "_constituentBaseElementId", _constituentBaseElementId);
        return helper.toString();
    }
}

