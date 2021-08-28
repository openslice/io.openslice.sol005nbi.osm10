package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.vnfd.rev190318;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * Virtual Network Function Descriptor.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-vnfd</b>
 * <pre>
 * module etsi-nfv-vnfd {
 *   yang-version 1.1;
 *   namespace urn:etsi:nfv:yang:etsi-nfv-vnfd;
 *   prefix vnfd;
 *   import etsi-nfv-descriptors {
 *     prefix vnf;
 *   }
 *   revision 2019-03-18 {
 *   }
 *   container vnfd {
 *     presence "VNFD container.";
 *     uses vnf:vnfd;
 *   }
 * }
 * </pre>
 *
 */
public interface EtsiNfvVnfdData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.vnfd.rev190318.Vnfd</code> <code>vnfd</code>, or <code>null</code> if not present
     */
    @Nullable Vnfd getVnfd();

}

